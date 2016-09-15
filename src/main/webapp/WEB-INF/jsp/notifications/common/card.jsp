<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="panel panel-info">
					<div class="panel-body ">
						<div class="media">
							<div class="media-left text-center">
								<a href="${x}/users/${topic.user.id}/topics"> <img class="media-object"
									src="${topic.user.avatar}"
									width="72px" alt="${topic.user.nick}">
								</a>
								<p>
									<span class="badge">${topic.user.role}</span>
								</p>
								<p>
									<label class="label label-primary">作者</label>
								</p>
								<p>

									<button class="btn btn-danger btn-xs" id="favor">关注</button>
								</p>
							</div>
							<div class="media-body">
								<p>
									<a href="${x}/users/${topic.user.id}/topics"><h4>${topic.user.nick}</h4></a>
								</p>
								<p>第${topic.user.number}号会员</p>
								<p>加入于${user.createAt}</p>
                                <p class="signature">${user.signature}</p>
							</div>
						</div>
					</div>
				</div>