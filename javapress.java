

package javapress;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class javapress {
 
    public String wordpress = "";
    public String password = "";
    
     
      public void CreateNewPost(String title, String body, int category)
    {
        try {
        String url = wordpress+"/poster.php";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", "JavaPress");

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("posttitle", title));
        urlParameters.add(new BasicNameValuePair("postcontent", body));
        urlParameters.add(new BasicNameValuePair("category", category+""));
        urlParameters.add(new BasicNameValuePair("passwordf", password));
                

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);    
        }

        System.out.println(result.toString());
    }
     catch (Exception e)
     {
         System.out.println("Couldn't complete action... \n Specified Reason: "+e);
     }    
    }
      
      public int getCategory(String CategoryLike)
      {
          int cat = 0;
          try{
          String url = wordpress+"/getcategory.php";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", "JavaPress");

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("category", CategoryLike));
         urlParameters.add(new BasicNameValuePair("passwordf", password));
          
        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);    
        }
cat = Integer.parseInt(result.toString());
        System.out.println(result.toString());
      }
      catch (Exception e)
     {
         System.out.println("Couldn't complete action... \n Specified Reason: "+e);
     }  
          return cat;
      }
      
      public void createCategory(String name)
      {
           try {
        String url = wordpress+"/createcategory.php";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", "JavaPress");

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("title", name));
         urlParameters.add(new BasicNameValuePair("passwordf", password));
        
                

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);    
        }

        System.out.println(result.toString());
    }
     catch (Exception e)
     {
         System.out.println("Couldn't complete action... \n Specified Reason: "+e);
     }    
      }
    
    public void deletePost(int postID)
    {
        
         try {
        String url = wordpress+"/deletepost.php";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", "JavaPress");

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("postid", postID+""));
         urlParameters.add(new BasicNameValuePair("passwordf", password));
     
        
                

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);    
        }

        System.out.println(result.toString());
    }
     catch (Exception e)
     {
         System.out.println("Couldn't complete action... \n Specified Reason: "+e);
     }    
        
    }
    
    public void deleteCategory(int catID)
    {
        
         try {
        String url = wordpress+"/deletecategory.php";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", "JavaPress");

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("catid", catID+""));
         urlParameters.add(new BasicNameValuePair("passwordf", password));
     
        
                

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);    
        }

        System.out.println(result.toString());
    }
     catch (Exception e)
     {
         System.out.println("Couldn't complete action... \n Specified Reason: "+e);
     }    
        
    }
    
public void createNewUser(String user, String email, String javapassword)
{
     try {
        String url = wordpress+"/newuser.php";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        // add header
        post.setHeader("User-Agent", "JavaPress");

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("user", user));
         urlParameters.add(new BasicNameValuePair("pass", password));
          urlParameters.add(new BasicNameValuePair("email", email));
           urlParameters.add(new BasicNameValuePair("passwordf", javapassword));
     
        
                

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);    
        }

        System.out.println(result.toString());
    }
     catch (Exception e)
     {
         System.out.println("Couldn't complete action... \n Specified Reason: "+e);
     } 
}

 public void updatePost(int postID, String postContent)
         
 {
     try {
        String url = wordpress+"/updatepost.php";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        post.setHeader("User-Agent", "JavaPress");

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("postid", postID+""));
        urlParameters.add(new BasicNameValuePair("content", postContent+""));
        urlParameters.add(new BasicNameValuePair("passwordf", password));
       
        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);    
        }

        System.out.println(result.toString());
    }
     catch (Exception e)
     {
         System.out.println("Couldn't complete action... \n Specified Reason: "+e);
     }
 }
 
 public String getPostType(int postID)
 {
     String type = "";
      try {
        String url = wordpress+"/getposttype.php";

        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        post.setHeader("User-Agent", "JavaPress");

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("postid", postID+""));
       
        urlParameters.add(new BasicNameValuePair("passwordf", password));
       
        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = rd.readLine()) != null) {
            result.append(line);  
            type = result.toString();
        }

        System.out.println(result.toString());
    }
     catch (Exception e)
     {
         System.out.println("Couldn't complete action... \n Specified Reason: "+e);
     }
      return type;
 }
 
         
      
}

