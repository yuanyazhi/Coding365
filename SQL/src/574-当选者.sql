# 表: Candidate
# 表: Vote；id 是自动递增的主键，CandidateId 是 Candidate 表中的 id.
# 请编写 sql 语句来找到当选者的名字，上面的例子将返回当选者 B.
select Name
from Candidate c right join Vote v on c.id = v.CandidateId
group by v.CandidateId having count(*) >= all(select count(*) from Vote group by CandidateId);