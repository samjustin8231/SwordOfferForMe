package niuke.easy;

public class JumpFloor {

	public static void main(String[] args) {
		System.out.println(JumpFloor(6));
	}

	public static int JumpFloor(int target) {

		if (target == 1 || target == 2)
			return target;

		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
}
