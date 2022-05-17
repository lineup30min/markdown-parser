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
    public void testGetLinksfile() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("https://something.com","some-thing.html"), links);
    }

    @Test 
    public void testGetLinksinfile2() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("https://something.com","some-page.html"), links);
    }

    @Test 
    public void testGetLinksinfile3() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile4() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile5() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile6() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile7() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile8() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> empty = new ArrayList <String>();
	    assertEquals(empty, links);
    }

    @Test 
    public void testGetLinksinfile9() throws IOException{
        Path fileName = Path.of("/Users/summerpines/Documents/GitHub/markdown-parser/space-in-link-and-image.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
	    assertEquals(List.of("https://something.com","some-page.html"), links);
    }


}