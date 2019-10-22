//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
public class profile {
    private String      fname;          //variable for first name
    private String      lname;          //variable for last name
    private int         pid;            //variable for people soft id
    private String      cstanding;      //variable for class standing
    private String      eid;            //variable for employee id
    private String      address;        //variable for address line 1
    private String      city;           //variable for city
    private String      state;          //variable for state
    private int         zip;            //variable for zip code
    private static int  count;          //variable for the count
    //I attempted to do validation using Regex, however it did not work properly.  Below is my attempt at validating email:
    /*
    public static boolean emailValidation (String eid) {
        String  emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(eid);
        return matcher.find();
    }
    */
    public void getInfo(String a, String b, int c, String d, String e, String f, String g, String h, int i){
        fname       = a;
        lname       = b;
        pid         = c;
        cstanding   = d;
        eid         = e;
        address     = f;
        city        = g;
        state       = h;
        zip         = i;
    }
    public void displayInfo(){
        System.out.println("Student's First Name: " + fname);
        System.out.println("Student's Last Name: " + lname);
        System.out.println("Student's PeopleSoft ID: " + pid);
        System.out.println("Student's Class Standing: " + cstanding);
        System.out.println("Student's Email ID: " + eid);
        System.out.println("Student's Address: " + address);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
    }
    public void setFname        (String aa) {fname = aa;}
    public void setLname        (String bb) {lname = bb;}
    public void setPid          (int cc)    {pid = cc;}
    public void setCstanding    (String dd) {cstanding = dd;}
    public void setEid          (String ee) {eid = ee;}
    public void setAddress      (String ff) {address = ff;}
    public void setCity         (String gg) {city = gg;}
    public void setState        (String hh) {state = hh;}
    public void setZip          (int ii) {zip = ii;}
    public String getFname()    {return fname;}
    public String getLname()    {return lname;}
    public int getPid()         {return pid;}
    public String getCstanding(){return cstanding;}
    public String getEid()      {return eid;}
    public String getAddress()  {return address;}
    public String getCity()     {return city;}
    public String getState()    {return state;}
    public int getZip()         {return zip;}
    public static int incrementCount(){
        count = count + 1;
        return (count);
    }
}