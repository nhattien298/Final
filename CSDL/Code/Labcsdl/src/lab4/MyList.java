package lab4;

public class MyList {
    public Node head, tail;
    public MyList(){
        head= tail= null;
    }
    public void clear(){
        head=tail=null;
    }
    public boolean isEmpty(){
        return(head == null);
    }
    public void addMany(String[]name, int [] age){

        for(int i=0; i<name.length;i++){
            Person p = new Person(name[i], age[i]);
            addPerson(p);
        }
    }
    // ham them 1 nguoi vao danh sach
    public void addPerson(Person x){
        Node newNode = new Node(x);
        if(isEmpty()){
            head= tail = newNode;

        }else{
            newNode.setNexNode( head);
            head = newNode;
        }
    }
    //ham duyet danh sach
    public void traverse(){
        Node currentNode = this.head;
        while(currentNode != null){
            System.out.println(currentNode.getInfo().toString());
            currentNode = currentNode.getNexNode();
        }
    }

    public void sortByName(){
        Node currentNode = this.head;
        while(currentNode!=null ){
            Node currentNextNode = currentNode.getNexNode();
            while(currentNextNode != null){
                if(currentNode.getInfo().getName().compareToIgnoreCase(currentNextNode.getInfo().getName())>0){
                    //swap
                    Person temp = currentNode.getInfo();
                    currentNode.setInfo(currentNextNode.getInfo());
                    currentNextNode.setInfo(temp);
                }
                currentNextNode = currentNextNode.getNexNode();
            }
            currentNode= currentNode.getNexNode();

        }
    }
    public void sortByAge(){
        Node currentNode = this.head;
        while(currentNode!=null){
            Node currentNextNode =currentNode.getNexNode();
            while(currentNextNode!=null){
                if(currentNode.getInfo().getAge() > currentNextNode.getInfo().getAge()){
                    Person temp = currentNode.getInfo();
                    currentNode.setInfo(currentNextNode.getInfo());
                    currentNextNode.setInfo(temp);
                }
                currentNextNode = currentNextNode.getNexNode();
            }
            currentNode =currentNode.getNexNode();
        }
    }

    public String toString(){
        String result = "{";
        Node currentNode = this.head;
        while(currentNode != null){
            result+= currentNode.getInfo().toString() + ";";
            currentNode = currentNode.getNexNode();
        }
        result+="}";
        return result;
    }


}
