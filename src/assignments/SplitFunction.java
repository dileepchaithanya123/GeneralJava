package assignments;

public class SplitFunction {

	public static void main(String[] args) {
		
		String str = "Abhineet Harsh <abhineet.harsh@factset.com>; Akhila Juturu <Akhila.Juturu@factset.com>; Amit Kumar Agrawal <amitkumar.agrawal@factset.com>; Aravind Kumar Gopa <aravind.gopa@factset.com>; Bhisham Udasi <bhisham.udasi@factset.com>; Bilal Dinc <BDinc@factset.com>; Christopher Shank <christopher.shank@factset.com>; Damini Damini <damini.damini@factset.com>; Dan Meteyer <dmeteyer@factset.com>; Deepak Avvari <deepak.avvari@factset.com>; Deepak Kumar Bahekar <deepakkumar.bahekar@factset.com>; Devi Krishna Prakash Vemuri <devikrishnaprakash.vemuri@factset.com>; Divya Kunapareddy <divya.kunapareddy@factset.com>; EKTA N. BHORANIYA <ektanitinbhai.bhoraniya@factset.com>; Adam C. Goode <adam.goode@factset.com>; Alexei Verminski <alexei.verminski@factset.com>; Daniel Gutierrez Diez <daniel.gutierrezdiez@factset.com>; Daniel Stankewitz <daniel.stankewitz@factset.com>; Lukas Chrzanowski-Vogel <lukas.chrzanowskivogel@factset.com>; Peter Haak <peter.haak@factset.com>; Sayed-Abbas Hashemi <sayed-abbas.hashemi@factset.com>; Calvin Wong <calvin.wong@factset.com>; David Finton <david.finton@factset.com>; Dean Louis Prabakar <dean.prabakar@factset.com>; Edmond Firooz <edmond.firooz@factset.com>; Erik Schmidt <erik.schmidt@factset.com>; Gregory King <gregory.king@factset.com>; Holger Lersch <holger.lersch@factset.com>; Jack Lin <jack.lin@factset.com>; Jonathan Sundquist <jonathan.sundquist@factset.com>; Kaushal Amin <kaushal.amin@factset.com>; Leon Reisman <leon.reisman@factset.com>; Muhammed Rahman <muhammed.rahman@factset.com>; Ongun Savas <ongun.savas@factset.com>; Reegal Kalariya <reegal.kalariya@factset.com>; Ryan OShea <Ryan.OShea@factset.com>; Srikanth Garlapalli <srikanth.garlapalli@factset.com>; Swapneel Kulkarni <swapneel.kulkarni@factset.com>; Aditya Gadiraju <aditya.gadiraju@factset.com>; Cesar Gaudin <cesar.gaudin@factset.com>; Mohsin Hassan <mohsin.hassan@factset.com>; G M Harish <mharish.g@factset.com>; Jacob Margolis <jacob.margolis@factset.com>; Jason Michaelson <jason.michaelson@factset.com>; Kautuk Desai <kautuk.desai@factset.com>; Kumar Shubham <kumar.shubham@factset.com>; Madadi Chethan Reddy <chethan.reddy@factset.com>; Murali Krishna Seelaboyina <murali.krishna@factset.com>; Priyanka Kumari <priyanka.kumari@factset.com>; Priyanka Marishetty <priyanka.marishetty@factset.com>; Priyanshu Goel <Priyanshu.Goel@factset.com>; Raghavulu Bussa <raghavulu.bussa@factset.com>; Raghuvaran Kassetty <raghuvaran.kassetty@factset.com>; Rahul Sharma <Rahul.Sharma@factset.com>; Ramesh Babu Kandagatla <ramesh.kandagatla@factset.com>; Ramya Mandyam <ramya.mandyam@factset.com>; Ravikanth Reddy Kasula <ravikanth.kasula@factset.com>; Sandhya Kumari <sandhya.kumari@factset.com>; Sanjeev Rai <sanjeev.rai@factset.com>; Siddaharth Suman <siddaharth.suman@factset.com>; Siva Kumar Kakarapalli <sivakumar.kakarapalli@factset.com>; Subho B <subho.bondada@factset.com>; Suraj P <suraj.p@factset.com>; Sushree Ranjan Moharana <sushreeranjan.moharana@factset.com>; Swathi Gunnam <swathi.gunnam@factset.com>; Swetha Gattu <swgattu@factset.com>; Thomas J. Passaro <thomas.passaro@factset.com>; Trideep Das <trideep.das@factset.com>; Ujjwal Kumar Jaiswal <ujjwalkumar.jaiswal@factset.com>; Vineet Dhayal <vineet.dhayal@factset.com>; Vishnu Kumar Tripathi <vishnukumar.tripathi@factset.com>";
				
		String[] arr = str.split(";");
		
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
				
	}

}
