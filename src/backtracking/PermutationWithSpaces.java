package backtracking;

import java.util.ArrayList;

class PermutationWithSpaces {

	ArrayList<String> permutation(String S) {
		ArrayList<String> al = new ArrayList<>();
		String s = permute(S, 0, S.length(),al);
		if(!al.contains(s))
			al.add(s);
		return al;
	}

	String permute(String s, int l, int r, ArrayList<String> al) {
		if (l == r)
			return s;

		for (int i = l; i < r; i++) {
			s=swap(s, l, i);
			s = permute(s, l + 1, r,al);
			if(!al.contains(s))
				al.add(s);
			s=swap(s, l, i);
		}
		return s;
	}

	String swap(String s, int l, int r) {
		if(l==r)
			return s;
		char ll=s.charAt(l);
		char rr=s.charAt(r);
		return s.substring(0, l)+rr+((r!=l+1)?s.substring(l+1, r):"")+ll+((r!=s.length()-1)?s.substring(r+1,s.length()):"");
	}

	public static void main(String[] args) {
		PermutationWithSpaces p = new PermutationWithSpaces();
		System.out.println(p.permutation("abc"));
	}
}