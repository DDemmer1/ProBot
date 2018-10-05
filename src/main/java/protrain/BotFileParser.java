package protrain;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BotFileParser {

    public Move[] parse(File file) throws IOException {

        List<Move> moveList = new ArrayList<Move>();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s = br.readLine()) != null) {
            if(s.length()>0 &&Character.isLetterOrDigit(s.charAt(0)))
                try {
                    Move move = parseFromString(s);
                    moveList.add(move);

                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        fr.close();
        br.close();



        return moveList.toArray(new Move[0]);
    }



    private Move parseFromString(String input) throws Exception {

        StringBuilder amount = new StringBuilder();
        Character action = '0';
        int line=0;

        for (Character c: input.toCharArray()) {

            if(Character.isDigit(c)){
                amount.append(c);
            } else if(Character.isLetter(c)){
                action = c;

                //Debug
                Move move = new Move(Integer.valueOf(amount.toString()),action);
//                System.out.println(move.toString());

                return move;
            }
            line++;

        }


            throw new BotFileParseException("Parse Exception in Line " + line+ " just one character per action allowed");

    }





}
