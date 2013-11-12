package common.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;

import artifacts.serverConnection.ServerConnection;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;


public class BpmLiteCommonUtils {

	private BpmLiteCommonUtils(){}; // statics only enforced.
	
	public static ServerConnection getServerConnectionFromFile(String fileLocation)
	{
		Gson gson = new Gson();
		JsonReader reader;
		try {
			reader = new JsonReader(new FileReader(fileLocation));
			ServerConnection serverConnection = gson.fromJson(reader, ServerConnection.class);
			return serverConnection;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
} 
