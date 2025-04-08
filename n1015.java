package April;
import java.io.*;
import java.util.*;
public class n1015 {
	static class Node{
		int n, idx, p;
		Node(int n, int idx){
			this.n = n;
			this.idx = idx;
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Node[] arr = new Node[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++)
			arr[i] = new Node(Integer.parseInt(st.nextToken()), i);
		
		Arrays.sort(arr, (n1, n2)-> n1.n - n2.n);
		
		for(int i = 0; i<n; i++)
			arr[i].p = i;
		
		Arrays.sort(arr, (n1, n2)-> n1.idx - n2.idx);
		
		for(Node k : arr) {
			System.out.println(k.p);
		}
		
	}
}
