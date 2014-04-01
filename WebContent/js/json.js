$(document).ready(
		function() {

			// Ϊ���ȡjsֵע����굥���¼�

			$("#getJsData").click(
					function() {

						$.getJSON("http://api.flickr.com/services/feeds/photos_public.gne?tags=cat&tagmode=any&format=json&jsoncallback=?", function(data){
								  $.each(data.items, function(i,item){
								    $("<img/>").attr("src", item.media.m).appendTo("#images");
								    if ( i == 3 ) return false;
								  });
								});

					});

			// Ϊ��ȡ����ֵ�İ�ťע����굥���¼�

			$("#getMessage").click(
					function() {

						$.getJSON("jsontest!returnMessage.action", function(
								data) {

							// ͨ��.���������Դ�data.message�л��Action��message��ֵ

							$("#message").html(
									"<font color='red'>" + data.message
											+ "</font>");

						});

					});

			// Ϊ��ȡUserInfo����ť������굥���¼�

			$("#getUserInfo").click(
					function() {

						$.getJSON("jsontest!returnUserInfo.action", function(
								data) {

							// �����ʾ���е�����

							$("#message").html("");

							// Ϊ��ʾ�����ӻ�ȡ��������

							// ��ȡ�����������data.userInfo.����

							$("#message").append(
									"<div><font color='red'>UserID:"
											+ data.userInfo.userId
											+ "</font></div>")

							.append(
									"<div><font color='red'>UserName:"
											+ data.userInfo.userName
											+ "</font></div>")

							.append(
									"<div><font color='red'>Password:"
											+ data.userInfo.password
											+ "</font></div>")

						});

					});

			// Ϊ��ȡList����ť������굥���¼�

			$("#getList").click(
					function() {

						$.getJSON("jsontest!returnList.action", function(data) {

							// �����ʾ���е�����

							$("#message").html("");

							// ʹ��jQuery�е�each(data,function(){});����

							// ��data.userInfosList��ȡUserInfo�������value֮��

							$.each(data.userInfosList, function(i, value) {

								$("#message").append(
										"<div>No. " + (i + 1) + " User:</div>")

								.append(
										"<div><font color='red'>UserID:"
												+ value.userId
												+ "</font></div>")

								.append(
										"<div><font color='red'>UserName:"
												+ value.userName
												+ "</font></div>")

								.append(
										"<div><font color='red'>Password:"
												+ value.password
												+ "</font></div>");

							});

						});

					});

			// Ϊ��ȡMap����ť������굥���¼�

			$("#getMap").click(
					function() {

						$.getJSON("jsontest!returnMap.action", function(data) {

							// �����ʾ���е�����

							$("#message").html("");

							// ʹ��jQuery�е�each(data,function(){});����

							// ��data.userInfosList��ȡUserInfo�������value֮��

							// keyֵΪMap�ļ�ֵ

							$.each(data.userInfosMap, function(key, value) {

								$("#message").append(
										"<div><font color='red'>UserID:"
												+ value.userId
												+ "</font></div>")

								.append(
										"<div><font color='red'>UserName:"
												+ value.userName
												+ "</font></div>")

								.append(
										"<div><font color='red'>Password:"
												+ value.password
												+ "</font></div>");

							});

						});

					});

			// ����������ͱ�������

			$("#regRe").click(
					function() {

						// �ѱ��������ݽ������л�

						var params = $("form").serialize();

						// ʹ��jQuery�е�$.ajax({});Ajax����

						$.ajax({

							url : "jsontest!gainUserInfo.action",

							type : "POST",

							data : params,

							dataType : "json",

							success : function(data) {

								// �����ʾ���е�����

								$("#message").html("");

								// Ϊ��ʾ�����ӻ�ȡ��������

								// ��ȡ�����������data.userInfo.����

								$("#message").append(
										"<div><font color='red'>UserID:"
												+ data.userInfo.userId
												+ "</font></div>")

								.append(
										"<div><font color='red'>UserName:"
												+ data.userInfo.userName
												+ "</font></div>")

								.append(
										"<div><font color='red'>Password:"
												+ data.userInfo.password
												+ "</font></div>")

							}

						});

					});

		});
