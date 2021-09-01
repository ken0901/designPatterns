package designPatterns.adapter;

public class AdapterImpl implements Adapter {
	
//	Math math;
	
	@Override
	public Float twiceOf(Float f) {
//		return (float) Math.twoTime(f.doubleValue());
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("logging : halfOf");
		// logging here AdapterImpl class NOT IN Math class 
		return (float) Math.half(f.doubleValue());
	}

}
