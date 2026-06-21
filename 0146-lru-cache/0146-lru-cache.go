type Node struct {
	key, val   int
	prev, next *Node
}

type LRUCache struct {
	cache       map[int]*Node
	cap         int
	left, right *Node
}

func Constructor(capacity int) LRUCache {
	cache := make(map[int]*Node)
	lru := LRUCache{
		cache: cache,
		cap:   capacity,
		left:  &Node{},
		right: &Node{},
	}
	lru.left.next = lru.right
	lru.right.prev = lru.left
	return lru
}

func (c *LRUCache) remove(node *Node) {
	next, prev := node.next, node.prev
	next.prev, prev.next = prev, next
}

func (c *LRUCache) insert(node *Node) {
	prev, next := c.right.prev, c.right
	node.prev, node.next = prev, next
	prev.next, next.prev = node, node
}

func (c *LRUCache) Get(key int) int {
	if node, ok := c.cache[key]; ok {
		c.remove(node)
		c.insert(node)
		return node.val
	}
	return -1
}

func (c *LRUCache) Put(key, val int) {
	if node, ok := c.cache[key]; ok {
		c.remove(node)
	}
	node := &Node{key: key, val: val}
	c.insert(node)
	c.cache[key] = node

	if len(c.cache) > c.cap {
		lru := c.left.next
		c.remove(lru)
		delete(c.cache, lru.key)
	}
}