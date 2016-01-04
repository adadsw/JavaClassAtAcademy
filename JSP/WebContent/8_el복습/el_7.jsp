<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<br>
한국의 수도는 ${address['Seoul']}<br>
한국의 수도는 ${address["Seoul"]} <br>
한국의 수도는 ${address[Seoul]} <br>
미국의 수도는 ${address.get('Washington DC')} <br>
일본의 수도는 ${address.get('Tokyo')}