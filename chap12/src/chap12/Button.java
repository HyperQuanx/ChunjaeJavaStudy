package chap12;

public class Button {
	OnClickListener ocl;
	void setOnClicklistener (OnClickListener ocl) {
		this.ocl = ocl;
	} // setter
	
	interface OnClickListener {
		public abstract void onClick();
	} // 기능
	
	void onClick() {
		ocl.onClick();
	} // 호출
}
