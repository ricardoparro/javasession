class AddTwoNumbers{


	public static void main(String[] args){

		Node list1 = new Node(2);
		list1.next = new Node(4);
		list1.next.next = new Node(3);

		Node list2 = new Node(5);
		list2.next = new Node(6);
		list2.next.next = new Node(4);

		Node listResult = AddTwoNumbers(list1, list2);

		printList(listResult);

	}

	public static Node AddTwoNumbers(Node list1, Node list2){

		Node nodeToSum1 = list1;
		Node nodeToSum2 = list2;
		Node listResult = null;
		int rest = 0;

		while(nodeToSum1 !=null && nodeToSum2 != null){
	

			int valToSumList1 = nodeToSum1.val;
			int valToSumList2 = nodeToSum2.val;
			int total = valToSumList1 + valToSumList2;
			if(rest > 0){
				total = rest + total;
				rest = 0;
			}
			if(total >= 10){
				rest = total/10;
				total = 0;
			}

			if(listResult == null){
				listResult = new Node(total);
			}
			else{
				addNodeToList(listResult,total);
			}
			nodeToSum1 = nodeToSum1.next;
			nodeToSum2 = nodeToSum2.next;

		}

		return listResult;
	}


	public static void printList(Node node){

		System.out.println(node.val);
		if(node.next != null)
			printList(node.next);
	}	

	public static void addNodeToList(Node node , int val){
		
		while(node != null){
			if(node.next == null){
				node.next = new Node(val);
				return;
			}
			else{
				node = node.next;
			}
		}
		
	}
}

//this should be in a separate file
class Node{

	int val;
	Node next;

	public Node(int val){
		this.next = null;
		this.val = val;
	}
	public String toString(){

		return " " + val;
	}
}