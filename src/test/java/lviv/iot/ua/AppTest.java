package lviv.iot.ua;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{
private String text;
private int maxLength;


    @Before
    public void init(){
        text = "Go_o_gle Ne_ws i_s a n_e_ws ag_g_r_e_g_a_t_or app deve_l_oped by Go_o_gle.";
        maxLength = 8;
    }



    @Test
    public void shouldAnswerWithTrue()
    {
        Set<String> filteredWords = WordParser.findWordsByPatterns(text, maxLength);
        filteredWords.forEach(System.out :: println);
        Assert.assertEquals(4, filteredWords.size());
        Assert.assertEquals(0 ,filteredWords.stream().filter(word -> word.matches("[^_]")).collect(
            Collectors.toList()).size());




    }
}


