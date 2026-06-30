1class MyLinkedList {
2    class Node{
3        int data;
4        Node next;
5        Node(int _data){
6            this.data=_data;
7        }
8    }
9   Node head;
10   Node tail;
11   int n;
12    public MyLinkedList() {
13       head=null;
14       tail=null;
15       n=0;
16    }
17    
18    public int get(int index) {
19        if(index<0||index>=n) return -1;
20        Node temp=head;
21        for(int i=0;i<index;i++){
22            temp=temp.next;
23        }return temp.data;
24    }
25    
26    public void addAtHead(int val) {
27        Node newNode=new Node(val);
28        if(n==0){
29            head=newNode;
30            tail=newNode;
31            n++;
32        }
33        else{
34            newNode.next=head;
35            head=newNode;
36            n++;
37        }
38    }
39    
40    public void addAtTail(int val) {
41        Node newNode=new Node(val);
42        if(n==0){
43            head=newNode;
44            tail=newNode;
45        }
46        else{
47            tail.next=newNode;
48            tail=newNode;
49        }
50        n++;
51    }
52    
53    public void addAtIndex(int index, int val) {
54         if(index>n)return;
55         if(index<0)index=0 ;
56         if(index==0) addAtHead(val);
57         else if(index==n) addAtTail(val);
58         else{
59            Node newNode=new Node(val);
60            Node temp=head;
61            for(int i=0;i<index-1;i++){
62                temp=temp.next;
63            }
64            newNode.next=temp.next;
65            temp.next=newNode;
66            n++;
67         }
68    }
69    
70    public void deleteAtIndex(int index) {
71        if(index<0||index>=n||n==0){
72            return;
73        }
74        if(head==tail){
75            head=null;
76            tail=null;
77            n--;
78        }else if(index==0){
79            head=head.next;
80            n--;
81        }else if(index==n-1){
82            Node temp=head;
83            for(int i=0;i<n-2;i++){
84                temp=temp.next;
85            }
86            temp.next=null;
87            tail=temp;
88            n--;
89        }else{
90            Node temp=head;
91            for(int i=0;i<index-1;i++){
92                temp=temp.next;
93            }
94            temp.next=temp.next.next;
95            n--;
96        }
97    }
98}
99
100/**
101 * Your MyLinkedList object will be instantiated and called as such:
102 * MyLinkedList obj = new MyLinkedList();
103 * int param_1 = obj.get(index);
104 * obj.addAtHead(val);
105 * obj.addAtTail(val);
106 * obj.addAtIndex(index,val);
107 * obj.deleteAtIndex(index);
108 */