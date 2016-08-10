package crypto.students;

import java.math.BigInteger;

import org.apache.log4j.Logger;

/***
 * In this class all the candidates must implement the methods
 * related to key derivation. You can create auxiliary functions
 * if you need it, using ONLY Java standard classes.
 * 
 * @author Pablo Serrano
 */
public class Supplementary {
	
	private static Logger log = Logger.getLogger(Supplementary.class);
	
	/***
	 * Receives a 2048 bits key and applies a word by word XOR
	 * to yield a 64 bit integer at the end.
	 * 
	 * @param key 2048 bit integer form part A1 DH Key Exchange Protocol
	 * @return A 64 bit integer
	 */
	public static BigInteger parityWordChecksum(BigInteger key) {

		return BigInteger.ZERO;
	}

    public static String change(String num,int from, int to){
        System.out.println(new java.math.BigInteger(num, from).toString(to));
    }

	/***
	 * 
	 * @param key 2048 bit integer form part A1 DH Key Exchange Protocol
	 * @param p A random 64 bit prime integer
	 * @return A 64 bit integer for use as a key for a Stream Cipher
	 */
	public static BigInteger deriveSuppementaryKey(BigInteger key, BigInteger p) {
		log.error("You must implement this function!");
		return BigInteger.ZERO;
	}

    public static void main(String args[]) {
        Supplementary.change("11380312415897726212538720767584623938377542218843650885786488543557849920563944820657401556147072220807050423844611527817088743264179887246035449031879964033048917437051768727745163996083995699396309860629605332639267450328379289961205789359923142431676348109877819086396004913235006262427231898532203764657706261780748597526471127787542155628754978941021278802504747939847153450812209928520258539639347968927907337576400038705453704498741239631581573919339705649004208586949422810873621196157474272177586468236634536851618181572350294408509526514361027546939234421045026063811415872877733865949984217287267027217419",10,2);
    }
}
