/** BinaryTree.java: Code to create a binary Tree, add Nodes in binary tree and traverse tree in inorder preorder and postorder.
 * To add nodes, code uses conditions and for traversal recursion is used.
 * Created by Arvind Bahl on 4/4/2019
 */

public class BinaryTree{

    //root node
    Node rootNode;

    // Method to add node in the binary tree
    public void addNode(int key, String name){
        Node newNode = new Node(key, name);
        if (rootNode == null){
            rootNode = newNode;

        }
        else{
            Node focusNode = rootNode;
            while(true){
                if (focusNode.key>key){
                    if (focusNode.leftChild ==null){
                        focusNode.leftChild = newNode;
                        break;
                    }
                    else{
                        focusNode= focusNode.leftChild;
                    }
                }
                else if(focusNode.key==key) {
                    System.out.println("The key " + key + " is there in bonary tree" );
                    break;
                }
                else{
                    if(focusNode.rightChild==null){
                        focusNode.rightChild = newNode;
                        break;
                    }
                    else{
                        focusNode = focusNode.rightChild;
                    }
                }

            }
        }

    }

    // inorder traversal of binary tree
    public void inorderTrav(Node rootNode){

        if (rootNode==null){
            return;
        }

        inorderTrav(rootNode.leftChild);
        rootNode.printNode();
        inorderTrav(rootNode.rightChild);

    }

    // preorder traversal of binary tree
    public void preorderTrav(Node rootNode){

        if (rootNode ==null){
            return;
        }

        rootNode.printNode();
        preorderTrav(rootNode.leftChild);
        preorderTrav(rootNode.rightChild);

    }

    // postorder traversal of binary tree
    public void postorderTrav(Node rootNode){

        if (rootNode ==null){
            return;
        }
        postorderTrav(rootNode.leftChild);
        postorderTrav(rootNode.rightChild);
        rootNode.printNode();

    }

    public static void main(String[] args){

        BinaryTree Employees = new BinaryTree();

        Employees.addNode(10, "John");
        Employees.addNode( 5, "Mike");
        Employees.addNode(25, "Jennifer");
        Employees.addNode(20, "Rob");
        Employees.addNode(35, "Julie");
        Employees.addNode(4, "Micheal");
        Employees.addNode(8, "Eric");

        Employees.rootNode.printNode();
        Employees.rootNode.leftChild.printNode();
        Employees.rootNode.rightChild.printNode();

        System.out.println("Following is Inorder traversal");
        Employees.inorderTrav(Employees.rootNode);

        System.out.println("Following is Preorder traversal");
        Employees.preorderTrav(Employees.rootNode);

        System.out.println("Following is Postorder traversal");
        Employees.postorderTrav(Employees.rootNode);
    }
}

// Node class containing constructor and variables key, string and child nodes.
class Node{

    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node (int key, String name){

        this.key= key;
        this.name = name;
    }

    public void printNode(){

        System.out.println("The name of node is " + name + " and key of node is " + key);
    }

}
