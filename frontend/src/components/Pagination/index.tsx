import { SalePage } from "types/sale";

type PageProps = {
    page: SalePage;
    onPageChange: Function;
}
const Pagination: React.FC<PageProps> = ({ page, onPageChange }) => {
    return (
        <div className="d-flex justify-content-center">
            <nav>
                <ul className="pagination">
                    <li className={`page-item ${page.first ? 'disabled' : ''}`}>
                        <button className="page-link" onClick={() => onPageChange(page.number - 1)}>Back</button>
                    </li>
                    <li className="page-item disabled">
                        <span className="page-link">{page.number + 1}</span>
                    </li>
                    <li className={`page-item ${page.last ? 'disabled' : ''}`}>
                        <button className="page-link" onClick={() => onPageChange(page.number + 1)}>Next</button>
                    </li>
                </ul>
            </nav>
        </div>

    )
}
export default Pagination;