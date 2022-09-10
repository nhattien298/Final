public class MyLinkList {

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public static void printLinkList(Node head) {
            if (head == null) {
                System.out.println("list is empty");
            } else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.value);
                    temp = temp.next;
                    if (temp != null) {
                        System.out.print("-->");
                    } else {
                        System.out.println();
                    }
                }

            }
        }

        public static Node addToHead(Node headNode, int value) {
            Node newNode = new Node(value);
            if (headNode != null) {
                newNode.next = headNode;
            }
            return newNode;
        }

        public static Node addToTail(Node headNode, int value) {
            Node newNode = new Node(value);
            if (headNode == null) {
                return newNode;
            } else {
                //b1 xac dinh last node
                Node lastNode = headNode;
                while (lastNode.next != null) {
                    lastNode = lastNode.next;
                }
                // gan next cho lastnode = newnode
                lastNode.next = newNode;


            }
            return headNode;
        }

        public static Node addToIndex(Node headNode, int value, int index) {
            if (index == 0) {
                return addToHead(headNode, value);
            } else {
                //b1 tim vi tri can them.
                Node newNode = new Node(value);
                Node currentNode = headNode;
                int count = 0;
                while (currentNode != null) {
                    count++;
                    if (count == index) {
                        // thuc hien add
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }
            return headNode;
        }

        public static Node removeAtHead(Node headNode) {
            if (headNode != null) {
                return headNode.next;
            }
            return headNode;
        }

        public static Node removeAtTail(Node headNode) {
            if (headNode == null) {
                return null;
            }
            // xac dinh last vaf previous
            Node lastNode = headNode;
            Node prevNode = null;
            while (lastNode.next != null) { // xac dinh duoc node cuoi cung, vi not cuoi cung se bang null. lastnode.next = null
                prevNode = lastNode;
                lastNode = lastNode.next;
            }
            if (prevNode == null) {
                return null;
            } else {
                prevNode.next = lastNode.next;
            }

            return headNode;
        }

        public static Node removeAtIndex(Node headNode, int index) {
            if (headNode == null || index < 0) {
                return null;
            }
            if (index == 0) {
                return removeAtHead(headNode);
            }
            Node currentNode = headNode;
            Node previousNode = null;
            boolean bisFound = false;
            int count = 0;
            while (currentNode != null) {
                if (count == index) {
                    bisFound = true;
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
                count++;
            }
            // remove cuurent index
            if (bisFound) {
                if (previousNode == null) { // curentnode is lastnode
                    return null;

                } else {
                    if (currentNode != null) {
                        previousNode.next = currentNode.next;
                    }

                }
            }
            return headNode;
        }

        public static void main(String[] args) {
            Node n1 = new Node(1);
            Node n2 = new Node(2);
            Node n3 = new Node(3);
            n1.next = n2;
            n2.next = n3;
            printLinkList(n1);
            Node newList = addToHead(n1, 8);
            printLinkList(newList);
            n1 = addToTail(n1, 10);
            printLinkList(n1);
            n1 = addToIndex(n1, 45, 2);
            printLinkList(n1);
            n1 = removeAtIndex(n1, 2);
            printLinkList(n1);
            n1 = removeAtIndex(n1, 1);
            printLinkList(n1);
            n1 = removeAtIndex(n1, 1);
            printLinkList(n1);
            n1 = removeAtIndex(n1, 1);
            printLinkList(n1);
            n1 = removeAtIndex(n1, 1);
            printLinkList(n1);

        }

    }
}
