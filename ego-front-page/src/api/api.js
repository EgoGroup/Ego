import axios from 'axios';

const URL = 'http://localhost:8080/';
export const getCateogryList = params => {
  return axios.get(URL + 'category/list', {
    params: params
  });
};
export const getIndexInfo = params => {
  return axios.get(URL)
};
export const isLogin = params => {
  return axios.get(URL + '/user/isLogin')
};
