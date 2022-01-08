package Level2;

import java.util.ArrayList;


public class �����ִ�ȭ {
	public static long answer = Long.MIN_VALUE;
	public static ArrayList<String> operList = new ArrayList<String>();
	public static ArrayList<Long> numList = new ArrayList<Long>();

	public static String[] oper = { "+", "-", "*" };
	public static String[] output = new String[3];
	public static boolean[] visited = new boolean[3];

	public long solution(String expression) {
		String n = "";
		for (int i = 0; i < expression.length(); i++) {
			char exp = expression.charAt(i);
			if (exp == '-' || exp == '+' || exp == '*') {
				operList.add(exp + "");
				numList.add(Long.parseLong(n));
				n = "";
			} else {
				n += exp;
			}
		}
		numList.add(Long.parseLong(n));
		per(0, oper.length);
		return answer;

	}

	public static void per(int depth, int l) {
		if (depth == l) {
			solve();
			System.out.println(output[0]+output[1]+output[2]);
			return;
		}
		for (int i = 0; i < oper.length; i++) {
			
			if(visited[i])continue;	
			visited[i] = true;
			output[depth] = oper[i];
			per(depth + 1, l);
			visited[i] = false;
			
		}
	}

	public static void solve() {
		ArrayList<String> opers = new ArrayList<String>();
		opers.addAll(operList);

		ArrayList<Long> num = new ArrayList<Long>();
		num.addAll(numList);

		for (int i = 0; i < output.length; i++) {
			String curoper = output[i];
			for (int j = 0; j < opers.size(); j++) {
				if (opers.get(j).equals(curoper)) {
					long n1 = num.get(j);
					long n2 = num.get(j + 1);
					long res = cal(n1, n2, curoper);

					num.remove(j + 1);
					num.remove(j);
					opers.remove(j);
					num.add(j, res);
					j--;
				}
			}
		}
		answer = Math.max(answer, Math.abs(num.get(0)));
	}

	static long cal(long n1, long n2, String o) {
		long res = 0;
		switch (o) {
		case "+":

			res=n1+n2;
			break;
		
		case "-":

			res=n1-n2;
			break;
		
		case "*":

			res=n1*n2;
			break;
		
		
	}
return res;
}
	
}
