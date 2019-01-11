public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public void printValuesForward() {
        Node runner = this.head;
        
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    public void printValuesBackwards() {
        Node runner = this.tail;

        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.previous;
        }
    }
    public void pop() {
        if(this.tail == null){
            System.out.println("Null");
        }else {
        this.tail = this.tail.previous;
        this.tail.next = null;
        }
    }
    public boolean contains(Integer value) {
        Node runner = this.head;

        while(runner != null) {
            if(runner.value == value) {
                return true;
            }
            runner = runner.next;
        }return false;
    }
    public int size() {
        if(this.tail == null){
            return 0;
        }else{ 
        Node runner = this.head;
        int count = 0;

        while(runner != null) {
            count++;
            runner = runner.next;
        }
        return count;
     }
    }
    public void removeAt(int index) {
        int size = size() -1;
        if(index > size){
            System.out.println("This index is out of range. DLL size: " + size);
        }
        else if(index == 0){
            this.head = this.head.next;
            this.head.previous = null;
        }else {
            Node runner = this.head;
            int count = 0;
            while(count != index) {
                count++;
                runner = runner.next;
            }
            runner.previous.next = runner.next;
            runner.next.previous = runner.previous;
        }
    }
    public void insertAt(Node newNode, int index) {
        int size = size() -1;
        if(index > size){
            System.out.println("This index is out of range. DLL size: " + size);
        } else if(index == 0){
            this.head.previous = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }else {
            Node runner = this.head;
            int count = 0;
            while(count != index) {
                count++;
                runner = runner.next;
            }
            runner.previous.next = newNode;
            newNode.previous = runner.previous;
            newNode.next = runner;
            runner.previous = newNode;
        }
    }
    public boolean isPalindrome(){
        if(this.head == null){
            return false;
        } else {
            Node runner = this.head;
            Node runner2 = this.tail;
            //This works but it checks it twice as they swap & don't have time to make more efficient 
            while(runner.value == runner2.value && runner.next != null){
                System.out.println("!");
                runner = runner.next;
                runner2 = runner2.previous;
                if(runner.value != runner2.value){
                    return false;
                }
            }return true;
        }
    }
}