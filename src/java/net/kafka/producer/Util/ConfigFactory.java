package Util;
import java.util.HashMap;
public class ConfigFactory {
	
	public static final String KAFKA_CONFIG_PATH = "/kafka.properties";
	public static final String LOG4J_CONFIG_PATH = "/log4j.properties";

	private static ConfigFactory instance = new ConfigFactory();
	private HashMap<String, ConfigProperties> configMap = new HashMap<String, ConfigProperties>();

	public static ConfigFactory getInstance() {
		return instance;
	}

	private ConfigFactory() {

	}

	/**
	 * This is the factory method for producing config properties object each
	 * path has a single instance of config properties
	 * 
	 * @param filePath
	 *            the class path to the config file
	 * @return
	 */
	synchronized public ConfigProperties getConfigProperties(String filePath) {
		ConfigProperties config = configMap.get(filePath);
		if (config == null) {
			config = new ConfigProperties(filePath);
			configMap.put(filePath, config);
		}

		return config;
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

	public static void main(String[] args)
	{
		System.out.println("test user1");
	}

}
