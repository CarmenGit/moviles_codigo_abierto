package com.cice.tutorialjava.Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LeerURLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String urlStr="http://www.mit.edu/";
		try{
			URL url=new URL(urlStr);
			URLConnection con =url.openConnection();
			InputStream in=con.getInputStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(in));
			String line;
			while((line=reader.readLine())!=null){
				System.out.println(line);
			}
			
		} catch(MalformedURLException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}

	}

}
