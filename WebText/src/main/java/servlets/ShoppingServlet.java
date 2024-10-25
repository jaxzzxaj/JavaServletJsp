//package servlets;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//
///**
// * Servlet implementation class test
// */
//@WebServlet("/test")
//public class ShoppingServlet extends HttpServlet {
//   
////	private int[] intValues;
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////	リクエスト
////日本語を要求
//	request.setCharacterEncoding("UTF-8");
////	HTMLに取得したい値のキーを指定
//	String [] strValues = request.getParameterValues("number");
////値が複数あるから配列にして、一個ずつ文字列から数字に変換する
//		if(strValues != null) {
//			int[] intValues = new int[strValues.length];
//		}try {
//			for(int i = 0; i < strValues.length; i++) {
//				intValues[i] = Integer.parseInt(strValues[i]);
//			}
//		
////	レスポンス}
////	日本語を箱の中に詰める
//	response.setContentType("text/html;charset=UTF-8");
////	HTMLからサーブレッドに繊維するときのためのHTMLを構築
//	PrintWriter xx = response.getWriter();
//	
//	xx.println("<html>");
//	xx.println("<head><title></title></head>");
//	xx.println("<body>");
//	
////　Calculatorクラスから計算式を引っ張ってくる
//	xx.println("<b>お買い上げありがとうございました。</b><br>");
//	xx.println("<br><br><br>");
//	xx.println("<b>小計："+100+"</b><br>");
//	xx.println("<b>小計："+100+"</b><br>");
//	xx.println("<b>(内消費税："+100+")</b>");
//	
//	xx.println("</body>");
//	xx.println("</html>");
//	
//		