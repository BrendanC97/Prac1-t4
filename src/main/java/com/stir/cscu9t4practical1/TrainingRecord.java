// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.time.Year;
import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    private List<SprintEntry> sprintEntryList;
    private List<CycleEntry> cycleEntryList;
    private List<SwimEntry> swimEntryList;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
        sprintEntryList = new ArrayList<>();
        cycleEntryList = new ArrayList<>();
        swimEntryList = new ArrayList<>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass

    public void addSprintEntry(SprintEntry sprintEntry)
    {
        sprintEntryList.add(sprintEntry);
    }

    public void addCycleEntry(CycleEntry cycleEntry)
    {
        cycleEntryList.add(cycleEntry);
    }

    public void addSwimEntry(SwimEntry swimEntry)
    {
        swimEntryList.add(swimEntry);
    }
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
             result = current.getEntry();
            }
       return result;
   } // lookupEntry

    public String lookupAll (int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        StringBuilder result = new StringBuilder("");
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
                result.append(current.getEntry()+ " ");
        }
        return result.toString();
    }

    public boolean checkUniqueEntry(String n, int d, int m, int y)
    {
        ListIterator<Entry> iter = tr.listIterator();
        boolean duplicateRecord = false;
        while(iter.hasNext()){
            Entry current = iter.next();
            if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
                duplicateRecord = true;
            break;
        }
        return duplicateRecord;
    }

    public String removeEntry(String name, int d, int m, int y){
        ListIterator<Entry> entryIterator = tr.listIterator();
        while(entryIterator.hasNext()){
            Entry current = entryIterator.next();
            if(current.getName().equals(name) && current.getDay()==d && current.getMonth() == m && current.getYear() == y) {
                tr.remove(current);
                return "Entry has been removed successfully";
            }
        }
        return "No entry was found with that data, entry removal unsuccessful ";
    }

   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord