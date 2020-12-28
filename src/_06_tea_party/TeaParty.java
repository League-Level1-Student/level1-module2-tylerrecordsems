package _06_tea_party;

import org.junit.Assert;

public class TeaParty {
    public void welcome(String name, boolean isWoman, boolean isKnighted) {
    	
    	import static org.junit.Assert.assertEquals;
    	import org.junit.Test;

    	class TeaPartyTest {
    		/**
    		 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
    		 * George Orwell is a man, so say “Hello Mr. Orwell”. 
    		 * Isa ac Newton was knighted, so say "Hello Sir Isaac Newton".
    		 **/  

    		@Test
    		public void testIsWomanNotKnighted() {
    			TeaParty teaParty = new TeaParty();
    			assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
    		}

    		@Test
    		public void testIsManNotKnighted() {
    			TeaParty teaParty = new TeaParty();
    			assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
    		}

    		@Test
    		public void testIsManKnighted() {
    			TeaParty teaParty = new TeaParty();
    			assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
    		}
    		
    		@Test
    		public void testIsWomanKnighted() {
    			TeaParty teaParty = new TeaParty();
    			assertEquals("Hello Lady Laura", teaParty.welcome("Laura", true, true));
    		}

    	}
    }
}
