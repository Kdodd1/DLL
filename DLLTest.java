public class DLLTest {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n7 = new Node(100);
        Node n4 = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(1);
        

        
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);
        
        // dll.printValuesForward();
        // dll.pop();
        dll.insertAt(n7, 3);
        dll.printValuesForward();
        System.out.println(dll.isPalindrome());
        // System.out.println(dll.contains(80));
        // System.out.println(dll.size());
        System.out.println("*******");
        dll.printValuesBackwards();
    }
}