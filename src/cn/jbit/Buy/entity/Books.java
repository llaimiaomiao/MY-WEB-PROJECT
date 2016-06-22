package cn.jbit.Buy.entity;

public class Books {
		private int bb_ID;
		private String bb_name;
		private String bb_author;
		private String bb_description;
		private int bb_price;
		private int bb_stock;
		private int bbc_ID;
		public int getBb_ID() {
			return bb_ID;
		}
		public void setBb_ID(int bbID) {
			bb_ID = bbID;
		}
		public String getBb_name() {
			return bb_name;
		}
		public void setBb_name(String bbName) {
			bb_name = bbName;
		}
		public String getBb_author() {
			return bb_author;
		}
		public void setBb_author(String bbAuthor) {
			bb_author = bbAuthor;
		}
		public String getBb_description() {
			return bb_description;
		}
		public void setBb_description(String bbDescription) {
			bb_description = bbDescription;
		}
		
		public int getBb_price() {
			return bb_price;
		}
		public void setBb_price(int bb_price) {
			this.bb_price = bb_price;
		}
		public int getBb_stock() {
			return bb_stock;
		}
		public void setBb_stock(int bbStock) {
			bb_stock = bbStock;
		}
		public int getBbc_ID() {
			return bbc_ID;
		}
		public void setBbc_ID(int bbcID) {
			bbc_ID = bbcID;
		}
		public String getBb_filename() {
			return bb_filename;
		}
		public void setBb_filename(String bbFilename) {
			bb_filename = bbFilename;
		}
		private String bb_filename;
}
