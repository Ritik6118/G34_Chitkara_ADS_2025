package Lecture_10;

public class InsertAt_Kth_pos_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertAtk(new ListNode(), 3,5);
	}

	private static ListNode insertAtk(ListNode head, int k, int val) {
		// TODO Auto-generated method stub
		ListNode curr=head;
		ListNode prev=null;
		for(int i=0;i<k;i++) {
			prev=curr;
			curr=curr.next;
		}
		ListNode nn=new ListNode(val);
		prev.next=nn;
		nn.next=curr;
		return head;
	}
	

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
