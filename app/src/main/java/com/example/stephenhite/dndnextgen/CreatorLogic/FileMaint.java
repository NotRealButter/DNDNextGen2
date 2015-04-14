//package com.example.stephenhite.dndnextgen.CreatorLogic;
//
//import org.xmlpull.v1.XmlPullParser;
//import org.xmlpull.v1.XmlPullParserFactory;
//
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FileMaint
//{
//    List<UserCharacter> characterList;
//    private UserCharacter userCharacter;
//    private String text;
//    public FileMaint()
//    {
//        characterList = new ArrayList<UserCharacter>();
//    }
//    public List<UserCharacter>getCharacterList()
//    {
//    return characterList;
//    }
//    public List<UserCharacter> parse(InputStream is)
//    {
//        XmlPullParserFactory factory = null;
//        XmlPullParser parser = null;
//
//        try
//        {
//            factory = XmlPullParserFactory.newInstance();
//            factory.setNamespaceAware(true);
//
//            parser = factory.newPullParser();
//            parser.setInput(is,null);
//
//            int eventType = parser.getEventType();
//            while(eventType!= XmlPullParser.END_DOCUMENT) {
//                String tagname = parser.getName();
//                switch (eventType) {
//                    case XmlPullParser.START_TAG:
//                        if (tagname.equalsIgnoreCase("character")) {
//                            userCharacter = new UserCharacter();
//                        }
//                        break;
//                    case XmlPullParser.TEXT:
//                        text = parser.getText();
//                        break;
//                    case XmlPullParser.END_TAG:
//                        if (tagname.equalsIgnoreCase("created_character"))
//                        {
//                            characterList.add(userCharacter);
//                        } else if (tagname.equalsIgnoreCase("name"))
//                        {
//                            userCharacter.setName(text);
//                        }
//                        else if (tagname.equalsIgnoreCase("health"))
//                        {
//                            userCharacter.setHealth(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("in_game_class"))
//                        {
//                            userCharacter.setClass1(text);
//                        }
//                        else if (tagname.equalsIgnoreCase("in_game_class2"))
//                        {
//                            userCharacter.setClass2(text);
//                        }
//                        else if (tagname.equalsIgnoreCase("age"))
//                        {
//                            userCharacter.setAge(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("gender"))
//                        {
//                            userCharacter.setGender(text);
//                        }
//                        else if (tagname.equalsIgnoreCase("alignment")) {
//                            userCharacter.setAlignment(text);
//                        } else if (tagname.equalsIgnoreCase("race"))
//                        {
//                            userCharacter.setRace(text);
//                        }
//                        else if (tagname.equalsIgnoreCase("height"))
//                        {
//                            userCharacter.setHeight(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("weight"))
//                        {
//                            userCharacter.setWeight(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("str_val"))
//                        {
//                            userCharacter.setStrVal(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("dex_val"))
//                        {
//                            userCharacter.setDexVal(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("con_val"))
//                        {
//                            userCharacter.setConVal(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("int_val"))
//                        {
//                            userCharacter.setIntVal(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("wis_val"))
//                        {
//                            userCharacter.setWisVal(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("cha_val"))
//                        {
//                            userCharacter.setChaVal(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("armor_class"))
//                        {
//                            userCharacter.setArmorClass(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("initiative"))
//                        {
//                            userCharacter.setInitiative(Integer.parseInt(text));
//                        }
//                        else if (tagname.equalsIgnoreCase("speed"))
//                        {
//                            userCharacter.setSpeed(Integer.parseInt(text));
//                        }
//                        break;
//                    default:
//                        break;
//                }
//                eventType = parser.next();
//            }
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return characterList;
//    }
//}
//
////https://www.youtube.com/watch?feature=player_detailpage&v=1clUga356ms#t=371
////        TODO:FixShit
