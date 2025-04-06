package april2nd2025;

public class ContinuationOfStrings {

    public static void main(String[] args) {
        String o="Continuation of Strings";

        //Returns the character that is present at 4th index position
        System.out.println(o.charAt(4));
        System.out.println(o.charAt(10));

        //We are trying to access the character that is greater than the length of the string
        //Throws StringIndexOutOfBoundsException
//        System.out.println(o.charAt(300));

        //Prints the string starting from 4th index position till the end
        System.out.println(o.substring(4));
        System.out.println(o.substring(15));

        //We are trying to access the character that is greater than the length of the string
        //Throws StringIndexOutOfBoundsException
//        System.out.println(o.substring(40));

        //Prints the string starting from 5th index position till the 10th index position
        //Inclusive of Starting index position and exclusive of end index position
        System.out.println(o.substring(5,10));

        o="Continuation of Strings";

        //We are trying to access the character that is greater than the length of the string
        //Throws StringIndexOutOfBoundsException
//        System.out.println(o.substring(20,25));

        //Prints the index position of the first occurence of the character 'i'
        System.out.println(o.indexOf('i'));
        System.out.println(o.indexOf("Strings")); //Returns -1 if the value is not present in the string

        //If the given string that we are trying to find is not present then it will return -1
        System.out.println(o.indexOf("offf"));

        o="Continuation of Strings";

        //Prints the index position of the last occurence of the character 'o'
        System.out.println(o.lastIndexOf("o"));
        System.out.println(o.lastIndexOf('s'));

        //Prints the ascii value of the given character at that particular index position
        System.out.println(o.codePointAt(6));

        //Prints the first occurence of the character 'n' when it is starting from 15th index position
        System.out.println(o.indexOf('n',15));

        //Checks if the string is starting with 'of' if I taking the string from 10th index position
        //Returns true if the above condition is satisfied else false
        System.out.println(o.startsWith("of",10));

        o="Same set of data that we are taking and Same set of results we fetch it";

        //For the first occurence of the word 'Same' , we are replacing it with 'Different'
        System.out.println(o.replaceFirst("Same","Different"));

        //From JDK 14 or 15 we have the concept of multi line strings:

        //.formatted() is used to replace the values in the string based on the expressions
        String k= """
                The rain and wind abruptly stopped, but the sky still had the gray swirls of storms in the distance. Dave knew this feeling all too well. The calm before the storm. He only had a limited amount of time before all Hell broke loose, but he stopped to admire the calmness. Maybe it would be different this time, he thought, with the knowledge deep within that it wouldn't.
                The choice was red, green, or blue. It didn't seem like an important choice when he was making it, but it was a choice nonetheless. Had he known the consequences at that time, he would likely have considered the choice a bit longer. In the end, he didn't and ended up choosing blue.
                It was their first date and she had been looking forward to it the entire week. She had her eyes on him for months, and it had taken a convoluted scheme with several friends to make it happen, but he'd finally taken the hint and asked her out. After all the time and effort she'd invested into it, she never thought that it would be anything but wonderful. It goes without saying that things didn't work out quite as she expected.
                He took a sip of the drink. He wasn't sure whether he liked it or not, but at this moment it didn't matter. She had made it especially for him so he would have forced it down even if he had absolutely hated it. That's simply the way things worked. She made him a new-fangled drink each day and he took a sip of it and smiled, saying it was excellent.
                The house was located at the top of the hill at the end of a winding road. It wasn't obvious that the house was there, but everyone in town knew that it existed. They were just all too afraid to ever go and see it in person.
                Don't be scared. The things out there that are unknown aren't scary in themselves. They are just unknown at the moment. Take the time to know them before you list them as scary. Then the world will be a much less scary place for you.
                There was no time. He ran out of the door without half the stuff he needed for work, but it didn't matter. He was late and if he didn't make this meeting on time, someone's life may be in danger.
                She's asked the question so many times that she barely listened to the answers anymore. The answers were always the same. Well, not exactly the same, but the same in a general sense. A more accurate description was the answers never surprised her. So, she asked for the 10,000th time, "What's your favorite animal?" But this time was different. When she heard the young boy's answer, she wondered if she had heard him correctly.
                There %s a time in his life when her rudeness would have set him over the edge. He would have raised his voice and demanded to speak to the manager. That was no longer the case. He barely reacted at all, letting the rudeness melt away without saying a word back to her. He had been around long enough to know where rudeness came from and how unhappy the person must be to act in that way. All he could do was feel pity and be happy that he didn't feel the way she did to lash out like that.
                It had been her dream for years but Dana had %s to take any action toward making it come true. There had always been a good excuse to delay or prioritize another project. As she woke, she realized she was once again at a crossroads. Would it be another excuse or would she finally find the courage to pursue her dream? Dana rose and took her first step.
                """.formatted("is","passed");

        System.out.println(k.length());

        System.out.println(k);

        System.out.println("Sum of Two Numbers is: "+(10+20)+" and this is desired output");

        String l="Kanara";

        // + symbol when used with the combination of strings, it is used to concatenate the values
        System.out.println("Today i have visited "+l+" bank and withdrew money");
    }
}
