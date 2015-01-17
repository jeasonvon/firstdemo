package von.demo.entity;

public class Pig implements IBehavior {

	@Override
	public String say() {
		String say = "pig says 噜噜噜";
		return say;
	}

	@Override
	public String move() {
		String move = "pig move 摇摇摇";
		return move;
	}

}
