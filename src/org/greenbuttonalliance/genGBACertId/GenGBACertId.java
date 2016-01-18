/**
 * 
 */
package org.greenbuttonalliance.genGBACertId;

/**
 *
 * @author Donald F Coffin
 *
 */
public class GenGBACertId {


	public static void main(String[] args) {
		
		String nameSpace = "org.greenbuttonalliance.cert";
		long epoch = System.currentTimeMillis()/1000;
		String date = new java.text.SimpleDateFormat("yyyy/MM/dd'T'HH:mm:ss'Z'").
				format(new java.util.Date (epoch*1000));
		
		String GBACertUuid = GBACertID.generate(nameSpace, date);
		
		System.out.printf("UUID NameSpace: %s\n", nameSpace);
		System.out.printf("UUID Name: %s\n", date);
		System.out.printf("Type 5 UUID: %s\n", GBACertUuid);

	}

}
