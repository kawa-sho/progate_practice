SELECT *
FROM purchases
-- 2017-08-01以前のデータの取得
where purchased_at <= "2017-08-01";