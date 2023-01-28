package list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Object> stack =new Stack<>();
		stack.add("ayush");
		System.out.println(stack);
		stack.push("Kumar");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.contains("ayush"));
		System.out.println(stack.search("yush"));
	}

}
