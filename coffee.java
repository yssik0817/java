package javaex;


public class coffee {
	//생성자 오버로딩
		public coffee(){}
        public coffee(int coffee, int sugar, int cream) {
        		this.coffee=coffee;
        		this.sugar=sugar;
        		this.cream=cream;
        	}
        	
        	private int coffee=1;
        	private int sugar=1;
        	private int cream=1;
        	
        	public void make(int coffee) {
        		this.coffee=coffee;
        		System.out.printf("커피 : "+this.coffee);
        		System.out.println("으로 만들어 졌습니다.");        		
        	}
        	
        	public void make(int coffee, int sugar) {
        		this.coffee=coffee;
        		this.sugar=sugar;
        		System.out.printf("커피 : "+this.coffee);
        		System.out.printf("설탕 : "+this.sugar);
        		System.out.println("으로 만들어 졌습니다.");        		
        	}
        	public void make(int coffee, int sugar, int cream) {
        		this.coffee=coffee;
        		this.sugar=sugar;
        		this.cream=cream;
        		System.out.printf("커피 : "+this.coffee);
        		System.out.printf("설탕 : "+this.sugar);
        		System.out.printf("크림 : "+this.cream);
        		System.out.println("으로 만들어 졌습니다.");        		
        	}
        }

