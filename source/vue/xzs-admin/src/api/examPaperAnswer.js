import { post } from '@/utils/request'

export default {
  page: query => post('/api/admin/examPaperAnswer/page', query),
  pageList: query => post('/api/admin/exam/paper/pageList', query),
  // answerSubmit: form => post('/api/student/exampaper/answer/answerSubmit', form),
  read: id => post('/api/admin/exam/paper/read/' + id),
  edit: form => post('/api/admin/exam/paper/correct', form)
}
