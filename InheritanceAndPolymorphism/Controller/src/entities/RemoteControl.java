package entities;

public class RemoteControl implements Controller {

	private int volume;
	private boolean on;
	private boolean playing;
	private boolean menu;

	private boolean isMenu() {
		return menu;
	}

	private void setMenu(boolean menu) {
		this.menu = menu;
	}

	public RemoteControl() {
		volume = 50;
		on = false;
		playing = false;
		menu = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isOn() {
		return on;
	}

	private void setOn(boolean on) {
		this.on = on;
	}

	private boolean isPlaying() {
		return playing;
	}

	private void setPlaying(boolean playing) {
		this.playing = playing;
	}
	// Abstracted methods

	@Override
	public void turnOn() {
		setOn(true);
	}

	@Override
	public void turnOff() {
		setOn(false);
	}

	@Override
	public void openMenu() {
		if (isOn() && !isMenu()) {
			System.out.println("-----MENU-----");
			System.out.println("Is on? " + isOn());
			System.out.println("Is playing? " + isPlaying());
			System.out.print("Volume: " + getVolume());

			for (int i = 0; i < getVolume(); i += 10) {
				System.out.print("|");
			}
			System.out.println();
			setMenu(true);
			return;
		}
		System.out.println("Unable to open menu!");

	}

	@Override
	public void closeMenu() {
		if (isOn() && isMenu()) {
			System.out.println("Menu closed");
			setMenu(false);
			return;
		}
		System.out.println("Unable to close menu!");

	}

	@Override
	public void plusVolume() {
		if (isOn()) {
			setVolume(getVolume() + 5);
			return;
		}
		System.out.println("Impossible plus volume!");

	}

	@Override
	public void menusVolume() {
		if (isOn() && getVolume() > 0) {
			setVolume(getVolume() - 5);
			return;
		}
		System.out.println("Impossible diminute volume!");

	}

	@Override
	public void turnMuteOn() {
		if (isOn() && getVolume() > 0) {
			setVolume(0);
		}
	}

	@Override
	public void turnMuteOff() {
		if (isOn() && getVolume() == 0) {
			setVolume(50);
		}
	}

	@Override
	public void play() {
		if (isOn() && !isPlaying()) {
			setPlaying(true);
			return;
		}
		System.out.println("Unable to play!");

	}

	@Override
	public void pause() {
		if (isOn() && isPlaying()) {
			setPlaying(false);
			return;
		}
		System.out.println("Unable to pause!");

	}

}
