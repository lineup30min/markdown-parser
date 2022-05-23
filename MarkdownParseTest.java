import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*; 
public class MarkdownParseTest {

    @Test  
    public void addition() { 
        assertEquals(4, 3 + 1);  
    }

    @Test 
    public void testGetLinksFile() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("https://something.com","some-thing.html"), links);
    }

    @Test 
    public void testGetLinksFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("https://something.com","some-page.html"), links);
    }

    @Test 
    public void testGetLinksFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }
    
    @Test 
    public void testGetLinksSnippet1() throws IOException{
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("`google.com","google.com","ucsd.edu"), links);
    }

    @Test 
    public void testGetLinksSnippet2() throws IOException{
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("a.com","a.com(())","example.com"), links);
    }

    @Test 
    public void testGetLinksSnippet3() throws IOException{
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"), links);
    }
}