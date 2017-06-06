//package com.karabeinikovAntonSikret87.app.homework.lesson17.HW2;
//
//import org.w3c.dom.ranges.RangeException;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//
///**
// * Created by AntonKa on 5/29/2017.
// */
//public class AdressBook {
//    private Map<Long, Record> records = new HashMap<Long, Record>();
//    private long nextId;
//    private long getNextId() {
//        if (nextId < Long.MAX_VALUE && !records.containsKey(nextId))
//            return nextId++;
//        nextId = 0;
//        while (nextId < Long.MAX_VALUE) {
//            if (!records.containsKey(nextId))
//                return nextId;
//            ++nextId;
//        }
//        throw new RangeException((short)111, "No more IDs availiable");
//    }
//   // private static HashMap<String, String> ts = new HashMap<>();
//
//    public static void showAll() throws IOException {
//        String contents = new String(Files.readAllBytes(Paths.get("src\\MyFile\\phone.txt")));
//        System.out.println(contents);
//    }
//
//    public static void searchInFile( String phrase) {
//        File file = new File("src\\MyFile\\phone.txt");
//        Scanner in = null;
//        try {
//            in = new Scanner(file);
//            while (in.hasNext()) {
//                String line = in.nextLine();
//                if (line.contains(phrase)) {
//                    System.out.println(line);
//                }
//            }
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Not found file");
//            e.printStackTrace();
//        }finally {
//            if (in != null) {
//                in.close();
//            }
//        }
//    }
//    public static void removeLineFromFile(String phrase) throws IOException {
//        File file = new File("src\\MyFile\\phone.txt");
//        PrintWriter pw = new PrintWriter(new FileWriter("src\\MyFile\\phone.txt"));
//        Scanner in = null;
//        try {
//            in = new Scanner(file);
//            while (in.hasNext()) {
//                String line = in.nextLine();
//                if (line.contains(phrase)) {
//                    line.replaceAll("\t", "");
//                   // System.out.println(line);
//                }
//            }
//        }
//        catch (FileNotFoundException e) {
//            System.out.println("Not found file");
//            e.printStackTrace();
//        }finally {
//            if (in != null) {
//                in.close();
//            }
//        }
//    }
//
//    public void saveToFile() throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src\\MyFile\\phone.txt")));
//        for(Map.Entry<Long, Record> k: records.entrySet()){
//            writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
//        }
//        writer.close();
//    }
//    public Record addRecord(String phone, String name, String address)
//            throws CloneNotSupportedException {
//        long recordId = getNextId();
//        Record record = new Record(recordId, phone, name, address);
//        records.put(recordId, record);
//        return (Record)record.clone();
//    }
//    public Record getRecord(long id) throws CloneNotSupportedException {
//        if (records.containsKey(id))
//            return (Record)records.get(id).clone();
//        return null;
//    }
//    public Record updateRecord(long id, String phone, String name, String address)
//            throws CloneNotSupportedException {
//        Record record = new Record(id, phone, name, address);
//        records.put(id, record);
//        return getRecord(id);
//    }
//    public void removeRecord(long id) {
//        records.remove(id);
//    }
//    public List<Record> allRecords() {
//        List<Record> result = new ArrayList<Record>();
//        for (Record record : this.records.values())
//            result.add(record);
//        return result;
//    }
//}
