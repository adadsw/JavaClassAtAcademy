<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <BR>
한국의 수도는 ${address['Seoul']} <BR>
한국의 수도는 ${address["Seoul"]} <BR>
한국의 수도는 ${address[Seoul]} <BR>
미국의 수도는 ${address.get('Washington DC')} <BR>
일본의 수도는 ${address.get('Tokyo')}