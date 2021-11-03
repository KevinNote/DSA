package DataStructure;

// Refer to https://www.baeldung.com/java-avl-trees

public class AvlTree<T extends Comparable<T>> {
    private AvlNode<T> root;

    void updateHeight(AvlNode<T> node) {
        node.height = 1 + Math.max(node.left.height, node.right.height);
    }

    int getHeight(AvlNode<T> node) {
        return node == null ? -1 : node.height;
    }

    int getBalance(AvlNode<T> node) {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }

    private AvlNode<T> rotateLeft(AvlNode<T> node) {
        // https://www.baeldung.com/wp-content/uploads/2020/02/R-Large-1-1024x322.png
        AvlNode<T> x = node.left;
        AvlNode<T> z = x.right;
        x.right = node;
        x.right.left = z;

        // Update whose height is changed
        updateHeight(node);
        updateHeight(x);
        return x;
    }

    private AvlNode<T> rotateRight(AvlNode<T> node) {
        // https://www.baeldung.com/wp-content/uploads/2020/02/L-Large-1-1024x362.png
        AvlNode<T> x = node.right;
        AvlNode<T> z = x.left;

        node.right = z;
        x.left = node;

        // Update whose height is changed
        updateHeight(node);
        updateHeight(x);
        return x;
    }

    private AvlNode<T> rebalance(AvlNode<T> z) {
        updateHeight(z);
        int bl = getBalance(z);
        if (bl > 1) {
            // R > L
            if (getHeight(z.right) > getHeight(z.left)) {
                // RR
                z = rotateLeft(z);
            } else {
                // RR
                z.right = rotateRight(z);
                z = rotateLeft(z);
            }

        } else if (bl < -1) {
            if (getHeight(z.right) < getHeight(z.left)) {
                // LL
                z = rotateRight(z);
            } else {
                // LR
                z.left = rotateLeft(z);
                z = rotateRight(z);
            }
        }

        return z;
    }

    public AvlNode<T> insert(T value) throws Exception {
        return insert(root, value);
    }

    private AvlNode<T> insert(AvlNode<T> node, T value) throws Exception {
        if (node == null)
            return new AvlNode<T>(value);
        int cmp = node.data.compareTo(value);
        if (cmp == 0) {
            throw new Exception("SAME!");
        }
        if (cmp > 0) {
            // Node > V
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.left, value);
        }
        return rebalance(node);
    }

    private AvlNode<T> search(AvlNode<T> node, T value) {
        if (node == null)
            return null;
        int cmp = node.data.compareTo(value);
        if (cmp == 0) {
            return node;
        }
        if (cmp > 0) {
            // Node > V
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public AvlNode<T> search(T value) {
        AvlNode<T> current = root;
        while (current != null) {
            int cmp = current.data.compareTo(value);
            if (cmp == 0) {
                return current;
            }
            if (cmp < 0) {
                // Node > V
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}

class AvlNode<T> {
    T data;
    AvlNode<T> root, left, right;
    int height;

    public AvlNode(T v) {
        data = v;
    }
}
