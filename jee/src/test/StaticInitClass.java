package test;

/**
 * @date   : 2016. 7. 1.
 * @author : 신재현
 * @file   : StaticInitClass.java
 * @story   :
 */

public class StaticInitClass {

		
	static{
	System.out.println("Static 초기화 블록 실행중..");}// 클래스 초기화블록

{	System.out.println("인스턴스 초기화 블록 실행중.."); }//인스턴스 초기화블록

public StaticInitClass() {	System.out.println("생성자 초기화 블록 실행중..");} // 생성자 (초기화)

}

