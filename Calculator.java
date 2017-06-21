public class Calculator{
	private float result;

	public void add(float... params){
		for(Float param : params){
			this.result +=param;
		}
	}
	public void substract(float... params){
		for(Float param : params){
			this.result = params[0] - params[1];
			}
		}
	public void divide(float... params){
		for(Float param : params){
			this.result = params[0] / params[1];
			}
		}
	public void multiply(float... params){
		for(Float param : params){
			this.result = params[0] * params[1];
			}
		}
	public float getResult(){
		return this.result;
	}
	public void cleanResult(){
		this.result = 0;	
	}
}