package MainPackage1;

public class calculateFV {
		
		private double investmentAmount;
		private double years;
		private double annualInterestRate;

		public calculateFV(){
		}
		
		public calculateFV(double investmentAmount, double years, double annualInterestRate){
			this.investmentAmount = investmentAmount;
			this.years = years;
			this.annualInterestRate = annualInterestRate;
		}
		
		public double getinvestmentAmount(){
			return investmentAmount;
		}
		public double getyears(){
			return years;
		}
		public double getannualInterestRate(){
			return annualInterestRate;
		}
		
		public double getFutureValue(){
			return investmentAmount * Math.pow(1 + annualInterestRate/100, years);
		}
}

