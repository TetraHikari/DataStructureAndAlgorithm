package code;

public class MyLinkedList_651446 {
	public class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
		}
	}

	Node head = null;

	public void add(int d) {
		Node p = new Node(d);
		p.next = head;
		head = p;
	}

	public void insert(int d) {
		Node p = new Node(d);
		if (head == null) {
			head = p;
			return;
		}
		Node q = head;
		Node prev = null;
		while (q != null) {
			if (q.data > d) {
				break;
			}
			prev = q;
			q = q.next;
		}
		if (prev == null) {
			p.next = head;
			head = p;
		} else {
			p.next = q;
			prev.next = p;
		}
	}

	public int find(int d) {
		Node p = head;
		int i = 0;
		while (p != null) {
			if (p.data == d) {
				return i;
			}
			p = p.next;
			i++;
		}
		return -1;
	}

	public void delete(int d) {
		Node p = head;
		Node prev = null;
		while (p != null) {
			if (p.data == d) {
				if (prev == null) {
					head = p.next;
				} else {
					prev.next = p.next;
				}
				return;
			}
			prev = p;
			p = p.next;
		}
	}

	public void append(int d) {
		Node p = new Node(d);
		if (head == null) {
			head = p;
			return;
		}
		Node q = head;
		while (q.next != null) {
			q = q.next;
		}
		q.next = p;
	}


	public String toString() {
		StringBuffer sb = new StringBuffer("head ");
		Node p = head;
		while(p!=null) {
			sb.append("--> [");
			sb.append(p.data);
			sb.append("] ");
			p = p.next;
		}
		sb.append("-> null");
		return new String(sb);
	}

	private int size() {
		int count = 0;
		Node p = head;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}

	public void add(int[] d) {
		for (int i = d.length - 1; i >= 0; i--) {
			add(d[i]);
		}
	}

	public void insert(int [] d) {
		for (int i = 0; i < d.length; i++) {
			insert(d[i]);
		}
	}

	public void q1_rotate_clockwise(int k){
        if (k <= 0 || k >= size()) return;
        Node p = head;
        for(int i = 0; i < k - 1; i++){
            p = p.next;
        }
        Node q = p.next;
        p.next = null;
        Node r = q;
        while(r.next != null){
            r = r.next;
        }
        r.next = head;
        head = q;
    }

	public void q2_reverse() {
		Node p = head;
		Node prev = null;
		while (p != null) {
			Node q = p.next;
			p.next = prev;
			prev = p;
			p = q;
		}
		head = prev;
	}

	public void q3_remove_dup() {
		Node p = head;
		while (p != null) {
			Node q = p.next;
			Node prev = p;
			while (q != null) {
				if (q.data == p.data) {
					prev.next = q.next;
				} else {
					prev = q;
				}
				q = q.next;
			}
			p = p.next;
		}
	}

	public void q4_increment_digits(){
		Node p = head;
		Node q = null;
		while(p != null){
			if(p.data != 9){
				q = p;
			}
			p = p.next;
		}
		if(q == null){
			q = new Node(0);
			q.next = head;
			head = q;
		}
		q.data++;
		p = q.next;
		while(p != null){
			p.data = 0;
			p = p.next;
		}
	}

	public boolean q5_isPalindrome() {
		Node p = head;
		int n = size();
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = p.data;
			p = p.next;
		}
		for (int i = 0; i < n / 2; i++) {
			if (d[i] != d[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}