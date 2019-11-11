package abstract_factory;

abstract class Window {}
class PMWindow extends Window {}
class MotifWindow extends Window {}

abstract class ScrollBar {}
class PMScrollBar extends ScrollBar {}
class MotifScrollBar extends ScrollBar {}

abstract class WidgetFactory {
	public abstract Window createWindow();
	public abstract ScrollBar createScrollBar();
}

class PMWidgetFactory extends WidgetFactory {
	@Override
	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}
	
	@Override
	public Window createWindow() {
		return new PMWindow();
	}
}

class MotifWidgetFactory extends WidgetFactory {
	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}
	
	@Override
	public Window createWindow() {
		return new MotifWindow();
	}
}

public class main {
	public static void main(String[] args) {
		WidgetFactory f = new MotifWidgetFactory();
		
		System.out.println(f.createWindow());
		System.out.println(f.createScrollBar());
	}
}
