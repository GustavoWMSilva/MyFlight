package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	//metodo de classe que calcula a distancia entre dois objetos Geo
	public static double distancia(Geo geo1, Geo geo2) 
	{
		double lat1 = Math.toRadians(geo1.getLatitude());
        double lat2 = Math.toRadians(geo2.getLatitude());
        double lon1 = Math.toRadians(geo1.getLongitude());
        double lon2 = Math.toRadians(geo2.getLongitude());
        
        double difLat = (lat1-lat2)/2;
        double difLon = (lon1-lon2)/2;
        
        double d = Math.pow(Math.sin(difLat),2)+
                   Math.pow(Math.sin(difLon),2)*
                   Math.cos(lat1) * Math.cos(lat2);
        
        d = 2 * 6371 * Math.asin(Math.sqrt(d));
                
        return d;
	}

	public double distancia (Geo geo) 
	{
		Geo aux = new Geo(getLatitude(), getLongitude());
		return distancia(aux, geo);
	}
}
